package gd;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final vd.b f275442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f275444c;

    public a(@NonNull vd.b bVar, boolean z10, boolean z11) {
        this.f275442a = bVar;
        this.f275443b = z10;
        this.f275444c = z11;
    }

    public Bundle a() {
        return new i().t(r.renderVariant, this.f275442a).m(r.night, this.f275443b).m(r.lightCeiling, this.f275444c).a();
    }

    public a(Bundle bundle) {
        this(new j(bundle));
    }

    private a(j jVar) {
        r rVar = r.renderVariant;
        Serializable serializableS = jVar.s(rVar, null);
        if (serializableS instanceof vd.b) {
            this.f275442a = (vd.b) serializableS;
            this.f275443b = jVar.f(r.night, false);
            this.f275444c = jVar.f(r.lightCeiling, false);
        } else {
            throw new IllegalArgumentException(rVar.f224891a + " must be an instance of " + vd.b.class.getName());
        }
    }
}
