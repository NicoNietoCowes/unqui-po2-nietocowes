package tp6;

import java.util.ArrayList;

import tp4.Producto;


public class Banco {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<SolicitudCredito> solicitudes = new ArrayList<SolicitudCredito>();

	public void registrarCliente(Cliente c) {
		clientes.add(c);
		
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void registrarSolicitudCredito(SolicitudCredito s) {
		solicitudes.add(s);	
	}

	public ArrayList<SolicitudCredito> getSolicitudesDeCredito() {
		return solicitudes;
	}

	public Double montoTotalADesembolsar() {
		Double montoADesembolsar = 0.0;
		for (SolicitudCredito solicitud : solicitudes) {
			if(solicitud.estaAprobada()) {
				montoADesembolsar += solicitud.getMonto();
			}
		}
		return montoADesembolsar;
	}
	
	
}
