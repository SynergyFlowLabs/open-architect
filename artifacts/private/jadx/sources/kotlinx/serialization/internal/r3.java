package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@kotlin.u
@kotlinx.serialization.g
public final class r3 extends p2<kotlin.y1, kotlin.z1, q3> implements KSerializer<kotlin.z1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r3 f316006c = new r3();

    private r3() {
        super(hk.a.z(kotlin.y1.f313456b));
    }

    @NotNull
    protected q3 A(@NotNull long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new q3(toBuilder, null);
    }

    protected void B(@NotNull kotlinx.serialization.encoding.e encoder, @NotNull long[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.encodeInlineElement(getDescriptor(), i11).encodeLong(kotlin.z1.t(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return x(((kotlin.z1) obj).G());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object l(Object obj) {
        return A(((kotlin.z1) obj).G());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ kotlin.z1 s() {
        return kotlin.z1.d(y());
    }

    @Override // kotlinx.serialization.internal.p2
    public /* bridge */ /* synthetic */ void w(kotlinx.serialization.encoding.e eVar, kotlin.z1 z1Var, int i10) {
        B(eVar, z1Var.G(), i10);
    }

    protected int x(@NotNull long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return kotlin.z1.v(collectionSize);
    }

    @NotNull
    protected long[] y() {
        return kotlin.z1.i(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.p2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(@NotNull kotlinx.serialization.encoding.d decoder, int i10, @NotNull q3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(kotlin.y1.n(decoder.decodeInlineElement(getDescriptor(), i10).decodeLong()));
    }
}
