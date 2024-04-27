package miPrincipal;

public class ListaDeContactos {
    private Lista<Contacto> contactos;

    public ListaDeContactos() {
        contactos = new Lista<Contacto>();
    }

    public Lista<Contacto> mostrarTodosLosContactos() {
        return contactos;

    }

    public boolean agregarContactos(String nombres, String apellidos,
            String direccion, String correo, String telefono,
            String celular) throws PosicionIlegalException {
        Contacto con = buscarContacto(nombres, apellidos);
        if (con == null) { // se puede agregar el contacto
            Contacto nuevo = new Contacto(nombres, apellidos, direccion,
                    correo, telefono, celular);
            contactos.agregar(nuevo);
            return true;

        } else {
            return false;
        }

    }

    public Contacto buscarContacto(String nombres, String apellidos)
            throws PosicionIlegalException {
        for (int i = 0; i < contactos.getTamanio(); i++) {
            Contacto con = contactos.getValor(i);
            if (nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())) {
                return con;

            }

        }
        return null;

    }

    public boolean eliminaContacto(String nombres, String apellidos)
            throws PosicionIlegalException {

        Contacto con = buscarContacto(nombres, apellidos);
        if (con != null) {
            for (int i = 0; i < this.contactos.getTamanio(); i++) {

                Contacto contAux = contactos.getValor((i));

                if (contAux.getNombres().equals(nombres) && contAux.getApellidos().equals(apellidos)) {

                    contactos.remover(i);

                }
            }
            return true;
        } else {

            return false;

        }

    }

    public boolean modificarContacto(String nombres, String apellidos, String direccion, String correo, String telefono,
            String celular) throws PosicionIlegalException {

        Contacto con = buscarContacto(nombres, apellidos);
        if (con == null) {

            return false;
        } else {

            con.setNombres(nombres);
            con.setApellidos(apellidos);
            con.setDireccion(direccion);
            con.setCorreo(correo);
            con.setTelefono(telefono);
            con.setCelular(celular);

            return true;

        }
    }
}