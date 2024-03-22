package ru.mirea.gavrilovaad.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                ((MainActivity)getActivity()).onDateClicked(year, month+1, dayOfMonth);
            }
        };

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), dateSetListener, 2016, 05, 28);
        datePickerDialog.setTitle("Выберите дату:");

        return datePickerDialog;
    }
}