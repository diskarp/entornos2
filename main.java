public class Salida {
    static void escribir() throws IOException {
        byte CR = 13;
        byte LF = 10;

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\damci\\IdeaProjects\\ficheros\\fich1.bin");
            fos.write((byte)'a');
            fos.write((byte)'e');
            fos.write((byte)'i');
            fos.write(CR);
            fos.write(LF);
            fos.close();

        } catch (IOException ex) {
            System.out.println("ioe");
        }
    }
        }
