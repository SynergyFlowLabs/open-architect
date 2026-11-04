package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,120:1\n26#2:121\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode\n*L\n93#1:121\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f36988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f36989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f36990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f36991h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<r> f36992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private n0.j f36993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<String, Unit> f36994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36995d;

    @SourceDebugExtension({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,120:1\n32#2:121\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n95#1:121\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            int i10;
            synchronized (o.f36991h) {
                try {
                    a aVar = o.f36988e;
                    o.f36990g++;
                    i10 = o.f36990g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f36988e = aVar;
        f36989f = 8;
        f36991h = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull List<? extends r> list, @Nullable n0.j jVar, @Nullable Function1<? super String, Unit> function1) {
        this.f36992a = list;
        this.f36993b = jVar;
        this.f36994c = function1;
        this.f36995d = androidx.compose.ui.k.f39200c ? androidx.compose.ui.semantics.t.d() : f36988e.b();
    }

    @NotNull
    public final List<r> d() {
        return this.f36992a;
    }

    @Nullable
    public final n0.j e() {
        return this.f36993b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f36992a, oVar.f36992a) && Intrinsics.areEqual(this.f36993b, oVar.f36993b) && this.f36994c == oVar.f36994c;
    }

    public final int f() {
        return this.f36995d;
    }

    @Nullable
    public final Function1<String, Unit> g() {
        return this.f36994c;
    }

    public final void h(@Nullable n0.j jVar) {
        this.f36993b = jVar;
    }

    public int hashCode() {
        int iHashCode = this.f36992a.hashCode() * 31;
        n0.j jVar = this.f36993b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.f36994c;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public /* synthetic */ o(List list, n0.j jVar, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? null : jVar, function1);
    }
}
