package df;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import com.planner5d.library.f;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
public class c extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Folder f274557a;

    public c(Context context) {
        super(context);
        this.f274557a = null;
        setCompoundDrawablesWithIntrinsicBounds(com.planner5d.library.widget.drawable.c.f254258a.a(context, f.h.B8, -10395295), (Drawable) null, (Drawable) null, (Drawable) null);
        int dimension = (int) context.getResources().getDimension(f.g.J3);
        setGravity(19);
        setPadding(dimension, 0, 0, 0);
        setCompoundDrawablePadding(dimension);
        setLayoutParams(new AbsListView.LayoutParams(-1, (int) getResources().getDimension(f.g.I3)));
        setBackgroundResource(f.h.f167776s5);
    }

    public Folder getFolder() {
        return this.f274557a;
    }

    public void i(Folder folder, p0 p0Var) {
        this.f274557a = folder;
        setTextColor(d.g(getContext(), f.C1549f.f166585oh));
        setText(com.planner5d.library.services.textspan.b.d("<big><font color=\"#242424\">" + folder.title + "</font></big><br />" + getResources().getString(f.s.uq) + ": " + p0Var.h(folder.m())));
    }
}
