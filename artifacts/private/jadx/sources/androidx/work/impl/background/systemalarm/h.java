package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.impl.model.z;
import androidx.work.impl.w;
import androidx.work.v;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class h implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f76722b = v.i("SystemAlarmScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76723a;

    public h(@NonNull Context context) {
        this.f76723a = context.getApplicationContext();
    }

    private void d(@NonNull androidx.work.impl.model.v workSpec) {
        v.e().a(f76722b, "Scheduling work with workSpecId " + workSpec.f76983a);
        this.f76723a.startService(b.f(this.f76723a, z.a(workSpec)));
    }

    @Override // androidx.work.impl.w
    public boolean a() {
        return true;
    }

    @Override // androidx.work.impl.w
    public void b(@NonNull String workSpecId) {
        this.f76723a.startService(b.h(this.f76723a, workSpecId));
    }

    @Override // androidx.work.impl.w
    public void c(@NonNull androidx.work.impl.model.v... workSpecs) {
        for (androidx.work.impl.model.v vVar : workSpecs) {
            d(vVar);
        }
    }
}
