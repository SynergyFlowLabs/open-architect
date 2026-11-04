package androidx.media3.datasource;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@Deprecated
public final class z implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final r1 f62679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f62680c;

    public z(Context context) {
        this(context, (String) null, (r1) null);
    }

    @Override // androidx.media3.datasource.p.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y a() {
        y yVar = new y(this.f62678a, this.f62680c.a());
        r1 r1Var = this.f62679b;
        if (r1Var != null) {
            yVar.s(r1Var);
        }
        return yVar;
    }

    public z(Context context, @androidx.annotation.p0 String str) {
        this(context, str, (r1) null);
    }

    public z(Context context, @androidx.annotation.p0 String str, @androidx.annotation.p0 r1 r1Var) {
        this(context, r1Var, new a0.b().l(str));
    }

    public z(Context context, p.a aVar) {
        this(context, (r1) null, aVar);
    }

    public z(Context context, @androidx.annotation.p0 r1 r1Var, p.a aVar) {
        this.f62678a = context.getApplicationContext();
        this.f62679b = r1Var;
        this.f62680c = aVar;
    }
}
