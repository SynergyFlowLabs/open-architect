package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface m<T> {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,204:1\n97#2,4:205\n97#2,4:209\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n*L\n81#1:205,4\n82#1:209,4\n*E\n"})
    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f17472d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f17475c;

        public a(int i10, int i11, T t10) {
            this.f17473a = i10;
            this.f17474b = i11;
            this.f17475c = t10;
            if (!(i10 >= 0)) {
                androidx.compose.foundation.internal.e.g("startIndex should be >= 0");
            }
            if (!(i11 > 0)) {
                androidx.compose.foundation.internal.e.g("size should be > 0");
            }
        }

        public final int a() {
            return this.f17474b;
        }

        public final int b() {
            return this.f17473a;
        }

        public final T c() {
            return this.f17475c;
        }
    }

    static /* synthetic */ void a(m mVar, int i10, int i11, Function1 function1, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = mVar.getSize() - 1;
        }
        mVar.b(i10, i11, function1);
    }

    void b(int i10, int i11, @NotNull Function1<? super a<? extends T>, Unit> function1);

    @NotNull
    a<T> get(int i10);

    int getSize();
}
