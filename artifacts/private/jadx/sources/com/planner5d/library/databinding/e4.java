package com.planner5d.library.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.database.model.project.Project;

/* JADX INFO: loaded from: classes4.dex */
public class e4 extends d4 {

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final androidx.databinding.e0.i f158894t3 = null;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.annotation.p0
    private static final SparseIntArray f158895u3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f158896q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NonNull
    private final TextView f158897r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f158898s3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f158895u3 = sparseIntArray;
        sparseIntArray.put(com.planner5d.library.f.j.Rd, 3);
        sparseIntArray.put(com.planner5d.library.f.j.Jd, 4);
    }

    public e4(@androidx.annotation.p0 androidx.databinding.l lVar, @NonNull View view) {
        this(lVar, view, androidx.databinding.e0.c0(lVar, view, 5, f158894t3, f158895u3));
    }

    @Override // androidx.databinding.e0
    public boolean W() {
        synchronized (this) {
            try {
                return this.f158898s3 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.e0
    public boolean X0(int i10, @androidx.annotation.p0 Object obj) {
        if (com.planner5d.library.a.f131430o == i10) {
            p1((Project) obj);
            return true;
        }
        if (com.planner5d.library.a.f131418c != i10) {
            return false;
        }
        o1((Boolean) obj);
        return true;
    }

    @Override // androidx.databinding.e0
    public void Z() {
        synchronized (this) {
            try {
                this.f158898s3 = 4L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r0();
    }

    @Override // androidx.databinding.e0
    protected boolean e0(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.planner5d.library.databinding.d4
    public void o1(@androidx.annotation.p0 Boolean bool) {
        this.f158849p3 = bool;
        synchronized (this) {
            this.f158898s3 |= 2;
        }
        e(com.planner5d.library.a.f131418c);
        super.r0();
    }

    @Override // androidx.databinding.e0
    protected void p() {
        long j10;
        synchronized (this) {
            try {
                j10 = this.f158898s3;
                this.f158898s3 = 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Project project = this.f158848o3;
        Boolean bool = this.f158849p3;
        String str = ((j10 & 5) == 0 || project == null) ? null : project.title;
        long j11 = j10 & 6;
        int i10 = 0;
        if (j11 != 0) {
            boolean zZ0 = androidx.databinding.e0.z0(bool);
            if (j11 != 0) {
                j10 |= zZ0 ? 16L : 8L;
            }
            if (!zZ0) {
                i10 = 8;
            }
        }
        if ((6 & j10) != 0) {
            this.f158845l3.setVisibility(i10);
        }
        if ((j10 & 5) != 0) {
            androidx.databinding.adapters.f0.A(this.f158897r3, str);
        }
    }

    @Override // com.planner5d.library.databinding.d4
    public void p1(@androidx.annotation.p0 Project project) {
        this.f158848o3 = project;
        synchronized (this) {
            try {
                this.f158898s3 |= 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(com.planner5d.library.a.f131430o);
        super.r0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private e4(androidx.databinding.l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (View) objArr[2], (ImageView) objArr[4], (CardView) objArr[3]);
        int i10 = 0 | 3;
        this.f158898s3 = -1L;
        this.f158845l3.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f158896q3 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f158897r3 = textView;
        textView.setTag(null);
        D0(view);
        Z();
    }
}
