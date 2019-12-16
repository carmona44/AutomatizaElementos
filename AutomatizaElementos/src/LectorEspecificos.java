import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LectorEspecificos {
	
	private String rutaFichero, procedimiento, ano, tipoPersona;
	
	public LectorEspecificos(String ruta, String procedimiento, String ano, String tipoPersona){
		this.rutaFichero = ruta;
		this.procedimiento = procedimiento;
		this.ano = ano;
		this.tipoPersona = tipoPersona;
	}
	
	public void leeDatosEsp() {
		
		try (FileInputStream file = new FileInputStream(new File(rutaFichero))) {
			EscritorXml escritor = new EscritorXml(ano, procedimiento, tipoPersona);
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			
			//obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			
			//obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet.iterator();	
			Row row;
			
			String campos[] = {"","","","","","",""};
			String bloqueEspecificos[] = new String[sheet.getPhysicalNumberOfRows() - 1];
			
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				
				row = rowIterator.next();
				
				if(row.getRowNum() != 0) {
					//se obtiene las celdas por fila
					Iterator<Cell> cellIterator = row.cellIterator();
					Cell cell;
					
					//se recorre cada celda				
					while (cellIterator.hasNext()) {
						
						// se obtiene la celda en espec�fico y se la imprime
						cell = cellIterator.next();
						campos[cell.getColumnIndex()] = cell.getStringCellValue();
					}
					
					bloqueEspecificos[row.getRowNum() - 1] = escritor.formaCampoEsp(campos);
				}
			}
			
			escritor.generaXml(bloqueEspecificos);
			
			worbook.close();
			
		} catch (Exception e) {
			
			e.getMessage();
			
		}
	}
}
