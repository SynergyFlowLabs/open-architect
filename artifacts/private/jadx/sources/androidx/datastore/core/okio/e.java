package androidx.datastore.core.okio;

import androidx.datastore.core.q0;
import androidx.datastore.core.w;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import okio.r0;
import okio.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,230:1\n49#2,2:231\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n*L\n64#1:231,2\n*E\n"})
public final class e<T> implements q0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f49726f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Set<String> f49727g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final i f49728h = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f49729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.okio.d<T> f49730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<r0, v, w> f49731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<r0> f49732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f49733e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends l0 implements Function2<r0, v, w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49734a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke(@NotNull r0 path, @NotNull v vVar) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(vVar, "<anonymous parameter 1>");
            return g.a(path);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> a() {
            return e.f49727g;
        }

        @NotNull
        public final i b() {
            return e.f49728h;
        }

        private b() {
        }
    }

    static final class c extends l0 implements Function0<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f49735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<T> eVar) {
            super(0);
            this.f49735a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            r0 r0Var = (r0) ((e) this.f49735a).f49732d.invoke();
            boolean zIsAbsolute = r0Var.isAbsolute();
            e<T> eVar = this.f49735a;
            if (zIsAbsolute) {
                return r0Var.w();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((e) eVar).f49732d + ", instead got " + r0Var).toString());
        }
    }

    @SourceDebugExtension({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage$createConnection$2\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,230:1\n49#2,2:231\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage$createConnection$2\n*L\n80#1:231,2\n*E\n"})
    static final class d extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f49736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e<T> eVar) {
            super(0);
            this.f49736a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b bVar = e.f49726f;
            i iVarB = bVar.b();
            e<T> eVar = this.f49736a;
            synchronized (iVarB) {
                try {
                    bVar.a().remove(eVar.e().toString());
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull v fileSystem, @NotNull androidx.datastore.core.okio.d<T> serializer, @NotNull Function2<? super r0, ? super v, ? extends w> coordinatorProducer, @NotNull Function0<r0> producePath) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.f49729a = fileSystem;
        this.f49730b = serializer;
        this.f49731c = coordinatorProducer;
        this.f49732d = producePath;
        this.f49733e = g0.c(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 e() {
        return (r0) this.f49733e.getValue();
    }

    @Override // androidx.datastore.core.q0
    @NotNull
    public androidx.datastore.core.r0<T> createConnection() {
        String string = e().toString();
        synchronized (f49728h) {
            Set<String> set = f49727g;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new f(this.f49729a, e(), this.f49730b, this.f49731c.invoke(e(), this.f49729a), new d(this));
    }

    public /* synthetic */ e(v vVar, androidx.datastore.core.okio.d dVar, Function2 function2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, dVar, (i10 & 4) != 0 ? a.f49734a : function2, function0);
    }
}
