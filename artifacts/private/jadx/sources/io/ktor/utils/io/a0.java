package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCloseToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseToken.kt\nio/ktor/utils/io/CloseToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Throwable f296833a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<Throwable, c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f296834a = new a();

        a() {
            super(1, c0.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final c0 invoke(Throwable th2) {
            return new c0(th2);
        }
    }

    public a0(@Nullable Throwable th2) {
        this.f296833a = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Throwable c(a0 a0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = a.f296834a;
        }
        return a0Var.b(function1);
    }

    @Nullable
    public final Unit a(@NotNull Function1<? super Throwable, ? extends Throwable> wrap) throws Throwable {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Throwable thB = b(wrap);
        if (thB == null) {
            return null;
        }
        throw thB;
    }

    @Nullable
    public final Throwable b(@NotNull Function1<? super Throwable, ? extends Throwable> wrap) {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Object obj = this.f296833a;
        if (obj == null) {
            return null;
        }
        if (obj instanceof kotlinx.coroutines.h0) {
            return ((kotlinx.coroutines.h0) obj).b();
        }
        return obj instanceof CancellationException ? x1.a(((CancellationException) obj).getMessage(), this.f296833a) : wrap.invoke(obj);
    }
}
