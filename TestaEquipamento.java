public class TestaEquipamento {
    public static void main (String[] args) {
        Equipamento novoEquip = new Equipamento();
        novoEquip.setCodigoIdentificador(7689);
        System.out.println("O codigo identificador do equipamento eh: " + novoEquip.getCodigoIdentificador());

        Computador novoComputador = new Computador();
        novoComputador.memoria = 1000;
        novoComputador.processador = "Intel";
        novoComputador.setCodigoIdentificador(89787);
        System.out.println("O codigo identificador do computador eh: " + novoComputador.getCodigoIdentificador());

    }
}
