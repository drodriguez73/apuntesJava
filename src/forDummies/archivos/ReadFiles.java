package forDummies.archivos;

public class ReadFiles {

    
    public static void leerSinBuffer() {

        try (FileReader fileReader = new FileReader(absolutePath)) {
        	int ch = fileReader.read();
        	while (ch != -1) {
        		System.out.print((char) ch);	
        	}
            fileReader.close();

        } catch (FileNotFoundException e) {
        	// Exception handling
        } catch (IOException e) {
        	// Exception handling
        }

    }

    public static void leerConBuffer() {

        try (BufferedReader bufferedReader = 
            new BufferedReader(new FileReader(absolutePath))) {
                String line;
                while (line = bufferedReader.readLine() != null) {
                    System.out.println(line);
                }
                bufferedReader.close();

        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
    }

    public static void byteReader() {

        try (FileInputStream fileInputStream = 
            new FileInputStream(absolutePath)) {
                int ch;
                while (ch = fileInputStream.read() != -1) {
                     System.out.print((char) ch);
                }
                fileInputStream.close();

        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }

    }

    public static void bufferByteReader() {

        try (BufferedInputStream bufferedInputStream = 
            new BufferedInputStream(new FileInputStream(absolutePath))) {
                int ch;
                while (ch = bufferedInputStream.read() != -1) {
                    System.out.print((char) ch);
                }

        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }
    }


    public static void main(Srings[] args) {

    }
}