package androidx.window.layout;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f76444d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f76445e = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final z f76446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final s f76447c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {0, 0, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", com.google.android.gms.common.internal.z.a.f106673a, "$this$flow", com.google.android.gms.common.internal.z.a.f106673a}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super x>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f76448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f76449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f76450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f76451d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f76453f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f76453f = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(kotlinx.coroutines.channels.p pVar, x info) {
            Intrinsics.checkNotNullExpressionValue(info, "info");
            pVar.p(info);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = v.this.new b(this.f76453f, dVar);
            bVar.f76451d = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:22:0x0089  */
        /* JADX WARN: Code duplicated, block: B:25:0x0096 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x001f, B:19:0x0077, B:23:0x008c, B:25:0x0096, B:15:0x0044, B:18:0x0073), top: B:33:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        
            if (r5.emit(r11, r10) == r0) goto L28;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:9:0x0023). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super x> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public v(@NotNull z windowMetricsCalculator, @NotNull s windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f76446b = windowMetricsCalculator;
        this.f76447c = windowBackend;
    }

    @Override // androidx.window.layout.t
    @NotNull
    public kotlinx.coroutines.flow.i<x> c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return kotlinx.coroutines.flow.k.K0(new b(activity, null));
    }
}
