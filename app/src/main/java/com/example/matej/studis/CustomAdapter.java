package com.example.matej.studis;


/**
 * Created by Tan on 7/23/2015.
 * Description: This class is use for populate data into view_student_entry
 */
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import java.util.List;


public class CustomAdapter extends ArrayAdapter<Course> {

    public CustomAdapter(Context context, int resource, List<Course> course) {
        super(context, resource, course);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.courses_list, parent, false);
        }

        Course course = getItem(position);

        if (course != null) {
            TextView tvStudentId = (TextView) v.findViewById(R.id.courseId);
            TextView tvStudentName = (TextView) v.findViewById(R.id.course_name);
            tvStudentId.setText( Integer.toString(course.Id));
            tvStudentName.setText(course.Name);
        }

        return v;
    }
}