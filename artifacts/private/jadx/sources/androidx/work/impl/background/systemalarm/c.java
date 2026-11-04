package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.work.impl.model.z;
import androidx.work.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f76676f = v.i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.b f76678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f76679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f76680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.work.impl.constraints.e f76681e;

    c(@NonNull Context context, androidx.work.b clock, int startId, @NonNull g dispatcher) {
        this.f76677a = context;
        this.f76678b = clock;
        this.f76679c = startId;
        this.f76680d = dispatcher;
        this.f76681e = new androidx.work.impl.constraints.e(dispatcher.g().R());
    }

    @m1
    void a() {
        List<androidx.work.impl.model.v> listF = this.f76680d.g().S().k().F();
        ConstraintProxy.a(this.f76677a, listF);
        ArrayList<androidx.work.impl.model.v> arrayList = new ArrayList(listF.size());
        long jCurrentTimeMillis = this.f76678b.currentTimeMillis();
        for (androidx.work.impl.model.v vVar : listF) {
            if (jCurrentTimeMillis >= vVar.c() && (!vVar.H() || this.f76681e.a(vVar))) {
                arrayList.add(vVar);
            }
        }
        for (androidx.work.impl.model.v vVar2 : arrayList) {
            String str = vVar2.f76983a;
            Intent intentB = b.b(this.f76677a, z.a(vVar2));
            v.e().a(f76676f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f76680d.f().c().execute(new g.b(this.f76680d, intentB, this.f76679c));
        }
    }
}
