import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorXml {
	
	static final String BLOQUE1 = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>\r\n" + 
			"<modelo>\r\n" + 
			"	<codProcedimiento>";
	static final String BLOQUE2 = "</codProcedimiento>\r\n" + 
			"	<convocatoria>";
	static final String BLOQUE3 = "</convocatoria>\r\n" + 
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
			"			<!-- Datos de revisión-->\r\n" + 
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
			"										<![CDATA[Resultado revisión]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Resultado revisión]]>\r\n" + 
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
			"										<![CDATA[Tipo resolución]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo resolución]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede/>\r\n" + 
			"								<campoFormula/>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<!-- Datos específicos -->\r\n" + 
			"						<!-- En este bloque se ponen los datos específicos -->\r\n" + 
			"<!-- esta es la estructura de los campos de texto y desplegables-->";
	static final String BLOQUE4 = "<!-- datos bancarios -->\r\n" + 
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
			"						<!-- FIN Datos específicos -->			\r\n" + 
			"\r\n" + 
			"					</elementosLista>\r\n" + 
			"					<implementacion>\r\n" + 
			"						<clase>es.xunta.amtega.ptwanda.accesotrewa.expediente.impl.ConsultaDatosExpedienteServiceImpl</clase>\r\n" + 
			"						<metodo>obtenerResultadoRevision</metodo>\r\n" + 
			"						<parametros>{idExpediente}</parametros>\r\n" + 
			"					</implementacion>\r\n" + 
			"				</value>\r\n" + 
			"			</entry>\r\n" + 
			"			<!-- Dirección del solicitante -->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionSolicitante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Dirección solicitante]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Dirección solicitante]]>\r\n" + 
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
			"										<![CDATA[Tipo vía solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo vía solicitante]]>\r\n" + 
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
			"										<![CDATA[Nombre vía solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome vía solicitante]]>\r\n" + 
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
			"										<![CDATA[Número solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Número solicitante]]>\r\n" + 
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
			"										<![CDATA[Teléfono solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Teléfono solicitante]]>\r\n" + 
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
			"										<![CDATA[Teléfono móvil solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Teléfono móbil solicitante]]>\r\n" + 
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
			"										<![CDATA[correo electrónico solicitante]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[correo electrónico solicitante]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>//ProcedimientoXunta/SI460A/Entidad/txtEmail</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>SOLI1_EMAIL</campoFormula>\r\n" + 
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
			"			<!-- Dirección de notificación-->\r\n" + 
			"			<entry>\r\n" + 
			"				<key>direccionRepresentante</key>\r\n" + 
			"				<value>\r\n" + 
			"					<bloque>solicitud</bloque>\r\n" + 
			"					<descripcion>\r\n" + 
			"						<es_ES>\r\n" + 
			"							<![CDATA[Dirección representante]]>\r\n" + 
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
			"										<![CDATA[Tipo vía notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Tipo vía notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/cmbTipoVia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_TIPOVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>nombreVia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Nombre vía notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Nome vía notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtDireccion</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_NOMBREVIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>numero</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Número notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Número notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtNumero</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_NUMERO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>escalera</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Escalera notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Escaleira notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtBloque</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_BLOQUE</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>piso</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Piso notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Piso notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtPiso</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PISO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>puerta</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Puerta notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Porta notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtPuerta</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PUERTA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>parroquia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Parroquia Notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Parroquia Notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtParroquia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PARROQUIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>lugar</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[lugar Notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[lugar Notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtLugar</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_LUGAR</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>codigoPostal</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[CP notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[CP notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtCodigoPostal</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_CP</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>provincia</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Provincia notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Provincia notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/cmbProvincia</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_PROVINCIA</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>municipio</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Municipio notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Concello notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/cmbAyuntamiento</xpathSolicitudSede>\r\n" + 
			"								<campoFormula>NOTIF_MUNICIPIO</campoFormula>\r\n" + 
			"							</value>\r\n" + 
			"						</entry>\r\n" + 
			"						<entry>\r\n" + 
			"							<key>ciudad</key>\r\n" + 
			"							<value>\r\n" + 
			"								<bloque>solicitud</bloque>\r\n" + 
			"								<descripcion>\r\n" + 
			"									<es_ES>\r\n" + 
			"										<![CDATA[Localidad notificación]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Localidade notificación]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>String</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtLocalidad</xpathSolicitudSede>\r\n" + 
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
			"											<![CDATA[Telefono de notificación]]>\r\n" + 
			"										</es_ES>\r\n" + 
			"										<gl_ES>\r\n" + 
			"											<![CDATA[Telefono de notificación]]>\r\n" + 
			"										</gl_ES>\r\n" + 
			"									</descripcion>\r\n" + 
			"									<tipo>String</tipo>\r\n" + 
			"									<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtTelefono</xpathSolicitudSede>\r\n" + 
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
			"											<![CDATA[Email de notificación]]>\r\n" + 
			"										</es_ES>\r\n" + 
			"										<gl_ES>\r\n" + 
			"											<![CDATA[Email de notificación]]>\r\n" + 
			"										</gl_ES>\r\n" + 
			"									</descripcion>\r\n" + 
			"									<tipo>String</tipo>\r\n" + 
			"									<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/txtEmail</xpathSolicitudSede>\r\n" + 
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
			"							<![CDATA[Datos Notificación]]>\r\n" + 
			"						</es_ES>\r\n" + 
			"						<gl_ES>\r\n" + 
			"							<![CDATA[Datos Notificación]]>\r\n" + 
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
			"										<![CDATA[Notifíquese a]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Notifíquese a]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/rbNotificar</xpathSolicitudSede>\r\n" + 
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
			"										<![CDATA[Solicita canal electrónico]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Solicita canle electrónico]]>\r\n" + 
			"									</gl_ES>\r\n" + 
			"								</descripcion>\r\n" + 
			"								<tipo>Integer</tipo>\r\n" + 
			"								<xpathSolicitudSede>/ProcedimientoXunta/SI460A/Notificacion/rblModalidad</xpathSolicitudSede>\r\n" + 
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
			"										<![CDATA[Fecha elección medio]]>\r\n" + 
			"									</es_ES>\r\n" + 
			"									<gl_ES>\r\n" + 
			"										<![CDATA[Data elección medio]]>\r\n" + 
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
			"		<!-- Autorizacións -->";
	
	private String ano;
	private String procedimiento;
	private String camposSede[];
	private int index;
	
	public EscritorXml(String ano, String procedimiento){
		this.ano = ano;
		this.procedimiento = procedimiento;
		this.camposSede = new String[4];
		this.index = 0;
	}

	private String escribeElementos(String bloqueEspecificos[]) {
		String elementos = "";
		
		elementos += formaCabecera();
		elementos += BLOQUE3;
		
		for(int i=0; i<bloqueEspecificos.length; i++) {
			if(!bloqueEspecificos[i].equals("")) {
				elementos += bloqueEspecificos[i];
			}
		}
		
		elementos += BLOQUE4;
		elementos += formaElementosSede();
		
		return elementos;
	}
	
	public String formaCampoEsp(String campos[]) {
		
		String campo = "";
		
		if(campos[0].equals("CODIGO_DELEGACION") || campos[0].equals("INTERESADO_NOTIFICACION") || campos[0].equals("MEDIO_NOTIFICACION") || campos[0].equals("IDIOMA_EXPEDIENTE")) {
			
			campo = "<entry>\r\n" + 
					"				<key>" + campos[0] + "</key>\r\n" + 
					"				<value>\r\n" + 
					"					<xpathsolicitudsede>" + campos[4] + "</xpathsolicitudsede>\r\n" + 
					"				</value>\r\n" + 
					"			</entry>";
			
			camposSede[index] = campo;
			index++;
			campo = "";
			
		} else {
			
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
					"				<tipo>String</tipo>\r\n" + 
					"				<xpathSolicitudSede>" + campos[4] + "</xpathSolicitudSede>\r\n" + 
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
		return BLOQUE1 + this.procedimiento + BLOQUE2 + this.ano;
	}

}
