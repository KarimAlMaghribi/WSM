package hello_world.test.com.example.karim.bitctrl_app_3.Activities;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.R;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.Computer;

public class ComputerAdapter  extends RecyclerView.Adapter<ComputerAdapter.ComputerHolder> {

    private List<ComputerNote> notes = new ArrayList<>();

    @NonNull
    @Override
    public ComputerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.computeritem, parent, false);
        return new ComputerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ComputerHolder holder, int position) {
        ComputerNote currentNote = notes.get(position);
        holder.textViewTitle.setText(currentNote.getId());
        holder.textViewDescription.setText(currentNote.getLastvalidupdate());
        holder.textViewPriority.setText(String.valueOf(currentNote.getPlayersystem()));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public void setNotes(List<ComputerNote> notes) {
        this.notes = notes;
        notifyDataSetChanged();
    }


    class ComputerHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle;
        private TextView textViewDescription;
        private TextView textViewPriority;

        public ComputerHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            textViewDescription = itemView.findViewById(R.id.text_view_description);
            textViewPriority = itemView.findViewById(R.id.text_view_priority);
        }
    }
}
