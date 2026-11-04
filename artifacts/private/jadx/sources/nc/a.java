package nc;

import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import oc.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VertexBuffer f332750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IndexBuffer f332751b;

    private final void e(Engine engine, int i10, int i11, int i12) {
        VertexBuffer.b bVarB = new VertexBuffer.b().c(1).h(i10).b(VertexBuffer.c.POSITION, 0, VertexBuffer.a.FLOAT3, 0, i11);
        VertexBuffer.c cVar = VertexBuffer.c.COLOR;
        g(bVarB.b(cVar, 0, VertexBuffer.a.UBYTE4, i12 * 3, i11).f(cVar).d(engine));
        f(new IndexBuffer.a().c(3).a(IndexBuffer.a.b.USHORT).b(engine));
    }

    public final void a(@NotNull Engine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        if (this.f332750a != null) {
            engine.O(d());
        }
        if (this.f332751b != null) {
            engine.C(c());
        }
    }

    public final void b(@NotNull Engine engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        e(engine, 3, 16, 4);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(48).order(ByteOrder.nativeOrder());
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
        d().l(engine, 0, b.a(b.a(b.a(byteBufferOrder, new oc.a(1.0f, 0.0f, 0.0f, l1.a.f316127c)), new oc.a((float) Math.cos(2.0943951023931953d), (float) Math.sin(2.0943951023931953d), 0.0f, -16711936)), new oc.a((float) Math.cos(4.1887902047863905d), (float) Math.sin(4.1887902047863905d), 0.0f, -16776961)).flip());
        c().i(engine, ByteBuffer.allocate(6).order(ByteOrder.nativeOrder()).putShort((short) 0).putShort((short) 1).putShort((short) 2).flip());
    }

    @NotNull
    public final IndexBuffer c() {
        IndexBuffer indexBuffer = this.f332751b;
        if (indexBuffer != null) {
            return indexBuffer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexBuffer");
        return null;
    }

    @NotNull
    public final VertexBuffer d() {
        VertexBuffer vertexBuffer = this.f332750a;
        if (vertexBuffer != null) {
            return vertexBuffer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vertexBuffer");
        return null;
    }

    public final void f(@NotNull IndexBuffer indexBuffer) {
        Intrinsics.checkNotNullParameter(indexBuffer, "<set-?>");
        this.f332751b = indexBuffer;
    }

    public final void g(@NotNull VertexBuffer vertexBuffer) {
        Intrinsics.checkNotNullParameter(vertexBuffer, "<set-?>");
        this.f332750a = vertexBuffer;
    }
}
