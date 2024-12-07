package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();
        Digitalizadora digitalizadora = new EquipamentoMultiFuncional();
        Copiadora copiadora = new EquipamentoMultiFuncional();
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
