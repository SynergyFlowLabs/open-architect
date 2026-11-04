package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class l3 extends p2<kotlin.q1, kotlin.r1, k3> implements KSerializer<kotlin.r1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final l3 f315967c = new l3();

    private l3() {
        super(hk.a.x(kotlin.q1.f312878b));
    }

    @NotNull
    protected k3 A(@NotNull byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new k3(toBuilder, null);
    }

    protected void B(@NotNull kotlinx.serialization.encoding.e encoder, @NotNull byte[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeByte(kotlin.r1.t(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return x(((kotlin.r1) obj).G());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return A(((kotlin.r1) obj).G());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ kotlin.r1 s() {
        return kotlin.r1.d(y());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ void w(kotlinx.serialization.encoding.e eVar, kotlin.r1 r1Var, int i10) {
        B(eVar, r1Var.G(), i10);
    }

    protected int x(@NotNull byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return kotlin.r1.v(collectionSize);
    }

    @NotNull
    protected byte[] y() {
        return kotlin.r1.i(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.p2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlinx.serialization.encoding.d decoder, int i10, @NotNull k3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(kotlin.q1.n(decoder.decodeInlineElement(getDescriptor(), i10).decodeByte()));
    }
}
