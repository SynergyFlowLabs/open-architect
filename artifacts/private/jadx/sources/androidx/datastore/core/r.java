package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r<T> implements q0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f49772d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("activeFilesLock")
    @NotNull
    private static final Set<String> f49773e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f49774f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0<T> f49775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<File, w> f49776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<File> f49777c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<File, w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49778a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke(@NotNull File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return y.a(it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> a() {
            return r.f49773e;
        }

        @NotNull
        public final Object b() {
            return r.f49774f;
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f49779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(0);
            this.f49779a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b bVar = r.f49772d;
            Object objB = bVar.b();
            File file = this.f49779a;
            synchronized (objB) {
                bVar.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f312394a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull l0<T> serializer, @NotNull Function1<? super File, ? extends w> coordinatorProducer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f49775a = serializer;
        this.f49776b = coordinatorProducer;
        this.f49777c = produceFile;
    }

    @Override // androidx.datastore.core.q0
    @NotNull
    public r0<T> createConnection() throws IOException {
        File file = this.f49777c.invoke().getCanonicalFile();
        synchronized (f49774f) {
            try {
                String path = file.getAbsolutePath();
                Set<String> set = f49773e;
                if (set.contains(path)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Intrinsics.checkNotNullExpressionValue(path, "path");
                set.add(path);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new s(file, this.f49775a, this.f49776b.invoke(file), new c(file));
    }

    public /* synthetic */ r(l0 l0Var, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l0Var, (i10 & 2) != 0 ? a.f49778a : function1, function0);
    }
}
