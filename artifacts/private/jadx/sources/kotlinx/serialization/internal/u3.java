package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class u3 extends p2<kotlin.e2, kotlin.f2, t3> implements KSerializer<kotlin.f2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final u3 f316030c = new u3();

    private u3() {
        super(hk.a.A(kotlin.e2.f312490b));
    }

    @NotNull
    protected t3 A(@NotNull short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new t3(toBuilder, null);
    }

    protected void B(@NotNull kotlinx.serialization.encoding.e encoder, @NotNull short[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeShort(kotlin.f2.t(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return x(((kotlin.f2) obj).G());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return A(((kotlin.f2) obj).G());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ kotlin.f2 s() {
        return kotlin.f2.d(y());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ void w(kotlinx.serialization.encoding.e eVar, kotlin.f2 f2Var, int i10) {
        B(eVar, f2Var.G(), i10);
    }

    protected int x(@NotNull short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return kotlin.f2.v(collectionSize);
    }

    @NotNull
    protected short[] y() {
        return kotlin.f2.i(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.p2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlinx.serialization.encoding.d decoder, int i10, @NotNull t3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(kotlin.e2.n(decoder.decodeInlineElement(getDescriptor(), i10).decodeShort()));
    }
}
