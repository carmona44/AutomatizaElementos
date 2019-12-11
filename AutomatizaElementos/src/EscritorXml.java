import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*TODO List
 * 
 * Crear todos los ficheros XML (actualmente solo elementos.xml)
 * 
 */

public class EscritorXml {
	
	private String bloque1 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>\r\n" + 
			"<modelo>\r\n" + 
			"	<codProcedimiento>";
	private String bloque2 = "</codProcedimiento>\r\n" + 
			"	<convocatoria>";
	private String bloque3 = "</convocatoria>\r\n" + 
			"	<origen>\r\n" + 
			"		<elementosorigen>\r\n" + 
			"			<entry>\r\n" + 
			"				<key>idSolicitud</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Identificador de la solicitud]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Identificador da solicitude]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>String</tipo>\r\n" + 
			"					<tabla>\r\n" + 
			"						<nombre>ESTRELLA</nombre>\r\n" + 
			"						<campo>ID_SOLICITUD</campo>\r\n" + 
			"						<tipo>NUMBER(19)</tipo>\r\n" + 
			"						<valor/>\r\n" + 
			"					</tabla>\r\n" + 
			"					<xpathSolicitudSede/>\r\n" + 
			"					<campoFormula/>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>		\r\n" + 
			"			<entry>\r\n" + 
			"				<key>idExpediente</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Identificador del expediente]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Identificador do expediente]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>String</tipo>\r\n" + 
			"					<tabla>\r\n" + 
			"						<nombre>ESTRELLA</nombre>\r\n" + 
			"						<campo>ID_EXPEDIENTE</campo>\r\n" + 
			"						<tipo>NUMBER(19)</tipo>\r\n" + 
			"						<valor/>\r\n" + 
			"					</tabla>\r\n" + 
			"					<xpathSolicitudSede/>\r\n" + 
			"					<campoFormula/>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Datos del solicitante-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>solicitante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos solicitante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos solicitante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombre</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre del solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome do solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtNombre</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NOMBRE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido1</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Primer apellido]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Apelido segundo]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtApel1</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_APELLIDO1</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido2</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Segundo apellido]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Segundo apelido]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtApel2</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_APELLIDO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoidentificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo documento]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo documento]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>SOLI1_TIPOIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>identificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Identificador]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Identificador]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtNifCif</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NUMIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosSolicitante</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Datos de revisi�n-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>revision</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos revision]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos revision]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>resultado</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Resultado revisi�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Resultado revisi�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula/>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoResolucion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo resoluci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo resoluci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula/>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<!-- Datos espec�ficos -->\r\n";
	private String bloque3Juridica = "</convocatoria>\r\n" + 
			"	<origen>\r\n" + 
			"		<elementosorigen>\r\n" + 
			"			<entry>\r\n" + 
			"				<key>idSolicitud</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Identificador de la solicitud]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Identificador da solicitude]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>String</tipo>\r\n" + 
			"					<tabla>\r\n" + 
			"						<nombre>ESTRELLA</nombre>\r\n" + 
			"						<campo>ID_SOLICITUD</campo>\r\n" + 
			"						<tipo>NUMBER(19)</tipo>\r\n" + 
			"						<valor/>\r\n" + 
			"					</tabla>\r\n" + 
			"					<xpathSolicitudSede/>\r\n" + 
			"					<campoFormula/>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>		\r\n" + 
			"			<entry>\r\n" + 
			"				<key>idExpediente</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Identificador del expediente]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Identificador do expediente]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>String</tipo>\r\n" + 
			"					<tabla>\r\n" + 
			"						<nombre>ESTRELLA</nombre>\r\n" + 
			"						<campo>ID_EXPEDIENTE</campo>\r\n" + 
			"						<tipo>NUMBER(19)</tipo>\r\n" + 
			"						<valor/>\r\n" + 
			"					</tabla>\r\n" + 
			"					<xpathSolicitudSede/>\r\n" + 
			"					<campoFormula/>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Datos del solicitante-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>solicitante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>generico</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos solicitante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos solicitante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombre</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre del solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome do solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtNombre</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NOMBRE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoidentificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo documento]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo documento]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>SOLI1_TIPOIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry> \r\n" + 
			"						<entry>\r\n" + 
			"							<key>identificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Identificador]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Identificador]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtNifCif</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NUMIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosSolicitante</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Datos de revisi�n-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>revision</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos revision]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos revision]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>resultado</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Resultado revisi�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Resultado revisi�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula/>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoResolucion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo resoluci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo resoluci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula/>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<!-- Datos espec�ficos -->";
	private String bloque4 = "<!-- datos bancarios -->\r\n" + 
			"						\r\n" + 
			"						<entry>\r\n" + 
			"							<key>titularCuenta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[titularCuenta]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[titularConta]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/DatosBancarios/txtNombreEntidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>ESP-accountHolder</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numeroCuenta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[numeroCuenta]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[numeroConta]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>concat(//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque1,//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque2,//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque3,//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque4,//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque5,//ProcedimientoXunta/SI460A/DatosBancarios/txtBloque6)</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>ESP-accountNumber</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>											\r\n" + 
			"							<!-- Fin datos bancarios -->\r\n" + 
			"							\r\n" + 
			"						\r\n" + 
			"						<!-- FIN Datos espec�ficos -->			\r\n" + 
			"\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.expediente.impl.ConsultaDatosExpedienteServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerResultadoRevision</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Direcci�n del solicitante -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionSolicitante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Direcci�n solicitante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Direcci�n solicitante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipovia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo v�a solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo v�a solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/cmbTipoVia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TIPOVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombreVia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre v�a solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome v�a solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtDireccion</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NOMBREVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numero</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[N�mero solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[N�mero solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtNumero</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NUMERO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>escalera</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Escalera solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Escaleira solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtBloque</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_BLOQUE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>piso</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Piso solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Piso solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtPiso</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PISO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>puerta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Puerta solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Porta solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtPuerta</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PUERTA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>parroquia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Parroquia solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Parroquia solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtParroquia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PARROQUIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>lugar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[lugar solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[lugar solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtLugar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_LUGAR</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>codigoPostal</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[CP solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[CP solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtCodigoPostal</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CP</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>provincia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Provincia solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Provincia solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/cmbProvincia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CODPROV</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>municipio</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Municipio solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Concello solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/cmbAyuntamiento</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CODMUNICIPIO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>ciudad</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Localidad solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Localidade solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtLocalidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_LOCALIDAD</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>telefono</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tel�fono solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tel�fono solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtTelefono</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TELEFONO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>telefonoMovilSolicitante</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tel�fono m�vil solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tel�fono m�bil solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtMovil</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TELEFONO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" +
			"						<entry>\r\n" + 
			"							<key>email</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtEmail</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_EMAIL</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosContactoSolicitante</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"\r\n" + 
			"			<!-- Datos del representante -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>representante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos representante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos representante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombre</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Declarante/txtNombre</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_NOMBRE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido1</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Apellido representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Apelido representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Declarante/txtApel1</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_APELLIDO1</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido2</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Apellido 2 representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Apelido 2 representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Declarante/txtApel2</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_APELLIDO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoidentificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo Documento]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo Documento]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>REPR1_TIPOIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>identificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[DNI representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[DNI representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Declarante/txtNifCif</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_NUMIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosInteresados</metodo>\r\n" + 
			"						<parametros>{idExpediente},[razonInteres=REPRESENTANTE]</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Direcci�n de notificaci�n-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionRepresentante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Direcci�n representante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Enderezo representante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipovia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo v�a notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo v�a notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/cmbTipoVia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_TIPOVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombreVia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre v�a notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome v�a notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtDireccion</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_NOMBREVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numero</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[N�mero notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[N�mero notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtNumero</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_NUMERO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>escalera</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Escalera notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Escaleira notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtBloque</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_BLOQUE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>piso</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Piso notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Piso notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtPiso</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PISO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>puerta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Puerta notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Porta notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtPuerta</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PUERTA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>parroquia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Parroquia Notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Parroquia Notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtParroquia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PARROQUIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>lugar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[lugar Notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[lugar Notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtLugar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_LUGAR</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>codigoPostal</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[CP notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[CP notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtCodigoPostal</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_CP</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>provincia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Provincia notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Provincia notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/cmbProvincia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PROVINCIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>municipio</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Municipio notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Concello notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/cmbAyuntamiento</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_MUNICIPIO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>ciudad</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Localidad notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Localidade notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtLocalidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_LOCALIDAD</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"							<entry>\r\n" + 
			"								<!-- OK -->\r\n" + 
			"								<key>telefonoMovil</key>\r\n" + 
			"								<value>\r\n" + 
			"									<bloque>solicitud</bloque>\r\n" + 
			"									<!-- generico, solicitud, tramitacion -->\r\n" + 
			"									<descripcion>\r\n" + 
			"										<es_ES>\r\n" + 
			"											<![CDATA[Telefono de notificaci�n]]>\r\n" + 
			"										</es_ES>\r\n" + 
			"										<gl_ES>\r\n" + 
			"											<![CDATA[Telefono de notificaci�n]]>\r\n" + 
			"										</gl_ES>\r\n" + 
			"									</descripcion>\r\n" + 
			"									<tipo>String</tipo>\r\n" + 
			"									<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtTelefono</xpathSolicitudSede>\r\n" + 
			"									<campoFormula>NOTIF_TELEFONO2</campoFormula>\r\n" + 
			"								</value>\r\n" + 
			"							</entry>\r\n" + 
			"							<entry>\r\n" + 
			"								<!-- OK -->\r\n" + 
			"								<key>email</key>\r\n" + 
			"								<value>\r\n" + 
			"									<bloque>solicitud</bloque>\r\n" + 
			"									<!-- generico, solicitud, tramitacion -->\r\n" + 
			"									<descripcion>\r\n" + 
			"										<es_ES>\r\n" + 
			"											<![CDATA[Email de notificaci�n]]>\r\n" + 
			"										</es_ES>\r\n" + 
			"										<gl_ES>\r\n" + 
			"											<![CDATA[Email de notificaci�n]]>\r\n" + 
			"										</gl_ES>\r\n" + 
			"									</descripcion>\r\n" + 
			"									<tipo>String</tipo>\r\n" + 
			"									<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/txtEmail</xpathSolicitudSede>\r\n" + 
			"									<campoFormula>NOTIF_EMAIL</campoFormula>\r\n" + 
			"								</value>\r\n" + 
			"							</entry>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosContactoInteresado</metodo>\r\n" + 
			"						<parametros>{idExpediente},[razonInteres=REPRESENTANTE]</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>	\r\n" + 
			"\r\n" + 
			"			<entry>\r\n" + 
			"				<key>datosExpediente</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos Notificaci�n]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos Notificaci�n]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"<!-- OK -->\r\n" + 
			"							<key>interesadoNotificar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Notif�quese a]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Notif�quese a]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/rbNotificar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_INTERESADO_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>medioNotificacion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Solicita canal electr�nico]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Solicita canle electr�nico]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Notificacion/rblModalidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_MEDIO_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>fechaMedioNotificacion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Fecha elecci�n medio]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Data elecci�n medio]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Date</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>NOTIF_FECHA_ELECCION_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosExpediente</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>				\r\n" + 
			"		<!-- Autorizaci�ns -->";
	private String bloque4Juridica = "<!-- DATOS BANCARIOS -->\r\n" + 
			"						<entry>\r\n" + 
			"							<key>titularCuenta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[titularCuenta]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[titularConta]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/DatosBancarios/txtNombreEntidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>ESP-accountHolder</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<!--<xpathSolicitudSede>//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtNombreEntidad[1]</xpathSolicitudSede>-->\r\n" + 
			"								\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numeroCuenta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[numeroCuenta]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[numeroConta]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>concat(//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque1,//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque2,//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque3,//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque4,//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque5,//ProcedimientoXunta/SI452A/DatosBancarios/txtBloque6)</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>ESP-accountNumber</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>								<!--<xpathSolicitudSede>concat(//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque1[1],//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque2[1],//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque3[1],//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque4[1],//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque5[1],//ProcedimientoXunta[1]/SI452A[1]/DatosBancarios[1]/txtBloque6[1])</xpathSolicitudSede>-->\r\n" + 
			"																			\r\n" + 
			"						\r\n" + 
			"						\r\n" + 
			"				\r\n" + 
			"						<!-- Fin datos espec�ficos -->			\r\n" + 
			"\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.expediente.impl.ConsultaDatosExpedienteServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerResultadoRevision</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Direcci�n del solicitante -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionSolicitante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Direcci�n solicitante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Direcci�n solicitante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipovia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo v�a solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo v�a solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/cmbTipoVia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TIPOVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombreVia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre v�a solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome v�a solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtDireccion</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NOMBREVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numero</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[N�mero solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[N�mero solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtNumero</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_NUMERO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>escalera</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Escalera solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Escaleira solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtBloque</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_BLOQUE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>piso</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Piso solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Piso solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtPiso</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PISO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>puerta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Puerta solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Porta solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtPuerta</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PUERTA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>parroquia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Parroquia solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Parroquia solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtParroquia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_PARROQUIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>lugar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[lugar solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[lugar solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtLugar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_LUGAR</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>codigoPostal</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[CP solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[CP solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtCodigoPostal</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CP</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>provincia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Provincia solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Provincia solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/cmbProvincia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CODPROV</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>municipio</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Municipio solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Concello solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/cmbAyuntamiento</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_CODMUNICIPIO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>ciudad</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Localidad solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Localidade solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtLocalidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_LOCALIDAD</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>telefono</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tel�fono solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tel�fono solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtTelefono</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TELEFONO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<!-- ******************** Eliminar no caso de persoa xur�dica ******************** -->\r\n" + 
			"						<entry>\r\n" + 
			"							<key>movil</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtMovil</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_TELEFONO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>fax</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Fax solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Fax solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtFax</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_FAX</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>email</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Email solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Entidad/txtEmail</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_EMAIL</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosContactoSolicitante</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"\r\n" + 
			"			<!-- Datos del representante -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>representante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos representante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos representante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombre</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Declarante/txtNombre</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_NOMBRE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido1</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Apellido representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Apelido representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Declarante/txtApel1</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_APELLIDO1</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>apellido2</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Apellido 2 representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Apelido 2 representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Declarante/txtApel2</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_APELLIDO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>tipoidentificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Tipo Documento]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo Documento]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>REPR1_TIPOIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>identificador</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[DNI representante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[DNI representante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Declarante/txtNifCif</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>REPR1_NUMIDENT</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosInteresados</metodo>\r\n" + 
			"						<parametros>{idExpediente},[razonInteres=REPRESENTANTE]</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"\r\n" + 
			"			<!-- Datos de notificacion en caso de persona mixta o f�sica -->\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"			<!-- Direcci�n de notificaci�n en caso de persona jur�dica -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionRepresentante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Direcci�n representante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Enderezo representante]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<!-- OK -->\r\n" + 
			"							<key>telefonoMovil</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Telefono de notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Telefono de notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Notificacion/txtTelefono</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_TELEFONO2</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<!-- OK -->\r\n" + 
			"							<key>email</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Email de notificaci�n]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Email de notificaci�n]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Notificacion/txtEmail</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_EMAIL</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosContactoInteresado</metodo>\r\n" + 
			"						<parametros>{idExpediente},[razonInteres=REPRESENTANTE]</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>	\r\n" + 
			"			<entry>\r\n" + 
			"				<key>datosExpediente</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Datos Notificaci�n]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos Notificaci�n]]>\r\n" + 
			"						</gl_ES>\r\n" + 
			"					</descripcion>\r\n" + 
			"					<tipo>\r\n" + 
			"						<![CDATA[HashMap<String, String>]]>\r\n" + 
			"					</tipo>\r\n" + 
			"					<elementosLista>\r\n" + 
			"						<entry>\r\n" + 
			"							<!-- OK -->\r\n" + 
			"							<key>interesadoNotificar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>generico</bloque>\r\n" + 
			"								<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Notif�quese a]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Notif�quese a]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Notificacion/rbNotificar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_INTERESADO_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>medioNotificacion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Solicita canal electr�nico]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Solicita canle electr�nico]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI452A/Notificacion/rblModalidad</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_MEDIO_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>fechaMedioNotificacion</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<!-- generico, solicitud, tramitacion -->\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Fecha elecci�n medio]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Data elecci�n medio]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Date</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula>NOTIF_FECHA_ELECCION_NOTIFICACION</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.interesados.impl.ConsultaInteresadosServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerDatosExpediente</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>		\r\n" + 
			"			\r\n" + 
			"			<!-- Autorizaci�ns -->";
	
	private String ano;
	private String procedimiento;
	private String persona;
	private String camposSede[];
	private String comprobacionDatos;
	private int index;
	
	public EscritorXml(String ano, String procedimiento, String persona){
		this.ano = ano;
		this.procedimiento = procedimiento;
		this.persona = persona;
		this.camposSede = new String[4];
		this.comprobacionDatos = "";
		this.index = 0;
		this.bloque3 = bloque3.replace("SI460A", this.procedimiento);
		this.bloque4 = bloque4.replace("SI460A", this.procedimiento);
		this.bloque3Juridica = bloque3Juridica.replace("SI452A", this.procedimiento);
		this.bloque4Juridica = bloque4Juridica.replace("SI452A", this.procedimiento);
	}

	private String escribeElementos(String bloqueEspecificos[]) {
		FormateaXml buenFormato = new FormateaXml();
		String elementos = "";
		
		elementos += formaCabecera();
		elementos += (this.persona.equals("Juridica")) ? bloque3Juridica : bloque3;
		
		for(int i=0; i<bloqueEspecificos.length; i++) {
			if(!bloqueEspecificos[i].equals("")) {
				elementos += bloqueEspecificos[i];
			}
		}
		
		elementos += (this.persona.equals("Juridica")) ? bloque4Juridica : bloque4;
		elementos += comprobacionDatos;
		elementos += formaElementosSede();
		
		return buenFormato.getXmlFormateado(elementos, "2");
	}
	
	public String formaCampoEsp(String campos[]) {
		
		String campo = "";
		
		if(campos[0].equals("CODIGO_DELEGACION") || campos[0].equals("INTERESADO_NOTIFICACION") || campos[0].equals("MEDIO_NOTIFICACION") || campos[0].equals("IDIOMA_EXPEDIENTE")) {
			
			campo = "<entry>\r\n" + 
					"				<key>" + campos[0] + "</key>\r\n" + 
					"				<value>\r\n" + 
					"					<xpathsolicitudsede>/" + campos[4] + "</xpathsolicitudsede>\r\n" + 
					"				</value>\r\n" + 
					"			</entry>";
			
			camposSede[index] = campo;
			index++;
			campo = "";
			
		} else if(!campos[6].equals("no")) {
			System.out.println(campos[6]);
			campo = "<entry>\r\n" + 
					"				<key>" + campos[0] + "</key>\r\n" + 
					"				<value>\r\n" + 
					"					<bloque>solicitud</bloque>\r\n" + 
					"					<descripcion>\r\n" + 
					"						<es_ES>\r\n" + 
					"							<![CDATA[" + campos[2] + "]]>\r\n" + 
					"						</es_ES>\r\n" + 
					"						<gl_ES>\r\n" + 
					"							<![CDATA[" + campos[1] + "]]>\r\n" + 
					"						</gl_ES>\r\n" + 
					"					</descripcion>\r\n" + 
					"					<tipo>Boolean</tipo>\r\n" + 
					"					<tabla>\r\n" + 
					"						<nombre>ESTRELLA</nombre>\r\n" + 
					"						<campo>" + campos[6] + "</campo>\r\n" + 
					"						<tipo>NUMBER(1)</tipo>\r\n" + 
					"						<valor/>\r\n" + 
					"					</tabla>\r\n" + 
					"					<xpathSolicitudSede>/" + campos[4] + "</xpathSolicitudSede>\r\n" + 
					"					<campoFormula>" + campos[5] + "</campoFormula>\r\n" + 
					"				</value>\r\n" + 
					"			</entry>";
			
			comprobacionDatos += campo;
			
			campo = "";
			
		} else {
		
			
			String ruta = "";
			
			if(campos[3].equals("Boolean")) {
				ruta = "boolean(number(/" + campos[4] + "))";
			} else {
				ruta = "/" + campos[4];
			}
			
			campo = "<entry>\r\n" + 
					"			<key>" + campos[0] + "</key>\r\n" + 
					"			<value>\r\n" + 
					"				<bloque>solicitud</bloque>\r\n" + 
					"				<descripcion>\r\n" + 
					"					<es_ES>\r\n" + 
					"						<![CDATA[" + campos[2] + "]]>\r\n" + 
					"					</es_ES>\r\n" + 
					"					<gl_ES>\r\n" + 
					"						<![CDATA[" + campos[1] + "]]>\r\n" + 
					"					</gl_ES>\r\n" + 
					"				</descripcion>\r\n" + 
					"				<tipo>" + campos[3] + "</tipo>\r\n" + 
					"				<xpathSolicitudSede>" + ruta + "</xpathSolicitudSede>\r\n" + 
					"				<campoFormula>" + campos[5] + "</campoFormula>\r\n" + 
					"			</value>\r\n" + 
					"		</entry>";
		}		
		
		return campo;
	}
	
	public void generaXml(String bloqueEspecificos[]) {
		try {
			FileWriter fw = new FileWriter("elementos.xml");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(escribeElementos(bloqueEspecificos));
			bw.newLine();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			
			System.out.println("ERROR: " + e);
		}
		
	}
	
	private String formaElementosSede() {
		
		String bloque = "</elementosorigen>\r\n" + 
				"	</origen>\r\n" + 
				"	<sede>\r\n" + 
				"		<elementossede>\r\n" + 
							camposSede[0] + 
							camposSede[1] + 
							camposSede[2] + 
							camposSede[3] + 
				"		</elementossede>\r\n" + 
				"	</sede>\r\n" + 
				"</modelo>";
		
		return bloque;
	}
	
	private String formaCabecera() {
		return bloque1 + this.procedimiento + bloque2 + this.ano;
	}

}
