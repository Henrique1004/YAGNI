import java.util.ArrayList;
import java.util.List;

public class GastoBD {
    public List<Gasto> gastos;

    public GastoBD() {
        gastos = new ArrayList<>();
    }

    public void adicionarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public void removerGasto(Gasto gasto) {
        gastos.remove(gasto);
    }

    public Gasto getGasto(int id){
        for (Gasto gasto : gastos) {
            if(gasto.id == id){
                return gasto;
            }
        }
        return null;
    }

    public float getTotal(){
        float total = 0;
        for (Gasto gasto : gastos) {
            total += gasto.getValor();
        }
        return total;
    }
}
