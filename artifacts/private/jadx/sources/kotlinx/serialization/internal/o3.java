package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class o3 extends p2<kotlin.u1, kotlin.v1, n3> implements KSerializer<kotlin.v1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final o3 f315990c = new o3();

    private o3() {
        super(hk.a.y(kotlin.u1.f313438b));
    }

    @NotNull
    protected n3 A(@NotNull int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new n3(toBuilder, null);
    }

    protected void B(@NotNull kotlinx.serialization.encoding.e encoder, @NotNull int[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeInt(kotlin.v1.t(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return x(((kotlin.v1) obj).G());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return A(((kotlin.v1) obj).G());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ kotlin.v1 s() {
        return kotlin.v1.d(y());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ void w(kotlinx.serialization.encoding.e eVar, kotlin.v1 v1Var, int i10) {
        B(eVar, v1Var.G(), i10);
    }

    protected int x(@NotNull int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return kotlin.v1.v(collectionSize);
    }

    @NotNull
    protected int[] y() {
        return kotlin.v1.i(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.p2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlinx.serialization.encoding.d decoder, int i10, @NotNull n3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(kotlin.u1.n(decoder.decodeInlineElement(getDescriptor(), i10).decodeInt()));
    }
}
