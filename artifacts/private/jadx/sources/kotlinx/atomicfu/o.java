package kotlinx.atomicfu;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    @SourceDebugExtension({"SMAP\nTraceFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceFormat.kt\nkotlinx/atomicfu/TraceFormatKt$TraceFormat$1\n*L\n1#1,31:1\n*E\n"})
    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, Object, String> f313515a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Integer, Object, String> function2) {
            this.f313515a = function2;
        }

        @Override // kotlinx.atomicfu.n
        @NotNull
        public String a(int i10, @NotNull Object event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return this.f313515a.invoke(Integer.valueOf(i10), event);
        }
    }

    @kotlin.internal.f
    private static final n a(Function2<? super Integer, Object, String> format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new a(format);
    }
}
