public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExceptio e) {
            e.printStackTrace();
            System.out.println("O cep não corresponte com as regras do negocio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExceptio{
        if(cep.length() != 8)
            throw new CepInvalidoExceptio();

        // Simulando um cep formatado
        return "23.765-064";
    }
}
