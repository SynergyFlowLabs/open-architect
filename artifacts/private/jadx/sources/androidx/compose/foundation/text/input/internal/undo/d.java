package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.z7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.saveable.c0;
import androidx.compose.runtime.saveable.g0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20104j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f20108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f20111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.undo.b f20113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f20103i = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final c0<d, Object> f20105k = new a();

    public static final class a implements c0<d, Object> {
        a() {
        }

        @Override // androidx.compose.runtime.saveable.c0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj4;
            Object obj5 = list.get(3);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jB = x3.b(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jB2 = x3.b(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Long");
            boolean z10 = false & false;
            return new d(iIntValue, (String) obj3, str, jB, jB2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.c0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(g0 g0Var, d dVar) {
            return CollectionsKt.listOf(Integer.valueOf(dVar.d()), dVar.h(), dVar.f(), Integer.valueOf(w3.n(dVar.g())), Integer.valueOf(w3.i(dVar.g())), Integer.valueOf(w3.n(dVar.e())), Integer.valueOf(w3.i(dVar.e())), Long.valueOf(dVar.j()));
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c0<d, Object> a() {
            return d.f20105k;
        }

        private b() {
        }
    }

    public /* synthetic */ d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, j10, j11, j12, z10);
    }

    public final boolean b() {
        return this.f20112g;
    }

    @NotNull
    public final androidx.compose.foundation.text.input.internal.undo.a c() {
        if (this.f20113h == androidx.compose.foundation.text.input.internal.undo.b.Delete && w3.h(this.f20110e)) {
            if (w3.h(this.f20109d)) {
                return w3.n(this.f20109d) > w3.n(this.f20110e) ? androidx.compose.foundation.text.input.internal.undo.a.Start : androidx.compose.foundation.text.input.internal.undo.a.End;
            }
            return (w3.n(this.f20109d) == w3.n(this.f20110e) && w3.n(this.f20109d) == this.f20106a) ? androidx.compose.foundation.text.input.internal.undo.a.Inner : androidx.compose.foundation.text.input.internal.undo.a.NotByUser;
        }
        return androidx.compose.foundation.text.input.internal.undo.a.NotByUser;
    }

    public final int d() {
        return this.f20106a;
    }

    public final long e() {
        return this.f20110e;
    }

    @NotNull
    public final String f() {
        return this.f20108c;
    }

    public final long g() {
        return this.f20109d;
    }

    @NotNull
    public final String h() {
        return this.f20107b;
    }

    @NotNull
    public final androidx.compose.foundation.text.input.internal.undo.b i() {
        return this.f20113h;
    }

    public final long j() {
        return this.f20111f;
    }

    private d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10) {
        this.f20106a = i10;
        this.f20107b = str;
        this.f20108c = str2;
        this.f20109d = j10;
        this.f20110e = j11;
        this.f20111f = j12;
        this.f20112g = z10;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f20113h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? androidx.compose.foundation.text.input.internal.undo.b.Replace : androidx.compose.foundation.text.input.internal.undo.b.Delete : androidx.compose.foundation.text.input.internal.undo.b.Insert;
    }

    public /* synthetic */ d(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, j10, j11, (i11 & 32) != 0 ? z7.a() : j12, (i11 & 64) != 0 ? true : z10, null);
    }
}
