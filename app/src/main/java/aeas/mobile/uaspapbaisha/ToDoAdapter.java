package aeas.mobile.uaspapbaisha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {
    private Context context;
    private List<ToDo> toDoList;

    public ToDoAdapter(Context context, List<ToDo> toDoList) {
        this.context = context;
        this.toDoList = toDoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ToDo toDo = toDoList.get(position);

        holder.textId.setText(toDo.getId());
        holder.textWhat.setText(toDo.getWhat());
        holder.textTime.setText(toDo.getTime());
    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textId, textWhat, textTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textId = itemView.findViewById(R.id.text_id);
            textWhat = itemView.findViewById(R.id.text_what);
            textTime = itemView.findViewById(R.id.text_time);
        }
    }
}
