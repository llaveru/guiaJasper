package com.guiajasper.inventario;

import java.io.InputStream;
import java.util.List;

import com.guiajasper.entidades.Maquina;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Inventario {

	//este metodo genera el inventario, se le pasa una lista de objetos.
	public void generarInventario(List<Maquina> lista) throws JRException {
		
		//creamos un InputStream  con la plantilla confeccionada con iReport
		InputStream entrada = Inventario.class.getResourceAsStream("/Plantilla/plantillaInforme.jrxml");
		
		//a continuacion creamos un objeto JasperReport de esta forma, pasándole el InputStream 
		JasperReport informe= JasperCompileManager.compileReport(entrada);
		
		//creo el informe JasperPrint mediante un JasperFillManager al que le paso el objeto JasperReport anterior, 
		//puedo pasar parámetros tambien, pero esta vez no paso, y los datos a mostrar en el informe.
		JasperPrint impresion = JasperFillManager.fillReport(informe, null,new JRBeanCollectionDataSource(lista));
	
		//ultimo paso:
		JasperViewer.viewReport(impresion,false);
	}
}
