package EP105926;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event implements IEvent   {

    private Client cliente;
    private LocalDate parse;

    private List<Activity> listaAtividades = new ArrayList<>();

    public Event(Client cliente, LocalDate parse){

        this.cliente = cliente;
        this.parse = parse;

    }


    public Activity addActivity(Activity atividade){

        listaAtividades.add(atividade);

        return atividade;
    }

    @Override
    public LocalDate getDate() {
        return null;
    }

    @Override
    public double eventPrice() {
        return 0;
    }


}
