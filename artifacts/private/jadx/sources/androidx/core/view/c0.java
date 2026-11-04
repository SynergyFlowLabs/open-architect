package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f48615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f48616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnLongClickListener f48620f = new View.OnLongClickListener() { // from class: androidx.core.view.a0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f48450a.d(view);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnTouchListener f48621g = new View.OnTouchListener() { // from class: androidx.core.view.b0
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f48613a.e(view, motionEvent);
        }
    };

    public interface a {
        boolean a(@NonNull View view, @NonNull c0 c0Var);
    }

    public c0(@NonNull View view, @NonNull a aVar) {
        this.f48615a = view;
        this.f48616b = aVar;
    }

    public void a() {
        this.f48615a.setOnLongClickListener(this.f48620f);
        this.f48615a.setOnTouchListener(this.f48621g);
    }

    public void b() {
        this.f48615a.setOnLongClickListener(null);
        this.f48615a.setOnTouchListener(null);
    }

    public void c(@NonNull Point point) {
        point.set(this.f48617c, this.f48618d);
    }

    public boolean d(@NonNull View view) {
        if (this.f48619e) {
            return true;
        }
        boolean zA = this.f48616b.a(view, this);
        this.f48619e = zA;
        return zA;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    public boolean e(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48617c = x10;
            this.f48618d = y10;
        } else if (action == 1) {
            this.f48619e = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f48619e = false;
            }
        } else if (s0.l(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.f48619e && (this.f48617c != x10 || this.f48618d != y10)) {
            this.f48617c = x10;
            this.f48618d = y10;
            boolean zA = this.f48616b.a(view, this);
            this.f48619e = zA;
            return zA;
        }
        return false;
    }
}
