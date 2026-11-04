package io.ktor.network.sockets;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d0<S extends SelectableChannel & ByteChannel> extends m0 implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final S f296215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.j f296216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final io.ktor.utils.io.pool.h<ByteBuffer> f296217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final p0.e f296218l;

    public /* synthetic */ d0(SelectableChannel selectableChannel, io.ktor.network.selector.j jVar, io.ktor.utils.io.pool.h hVar, p0.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectableChannel, jVar, hVar, (i10 & 8) != 0 ? null : eVar);
    }

    @Nullable
    public final io.ktor.utils.io.pool.h<ByteBuffer> E() {
        return this.f296217k;
    }

    @NotNull
    public final io.ktor.network.selector.j H() {
        return this.f296216j;
    }

    @Override // io.ktor.network.sockets.m0
    @Nullable
    public Throwable o() {
        try {
            s().close();
            super.close();
            this.f296216j.g3(this);
            return null;
        } catch (Throwable th2) {
            this.f296216j.g3(this);
            return th2;
        }
    }

    @Override // io.ktor.network.sockets.m0
    @NotNull
    public final io.ktor.utils.io.d1 q(@NotNull io.ktor.utils.io.b channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return this.f296217k != null ? j.f(this, channel, (ReadableByteChannel) s(), this, this.f296216j, this.f296217k, this.f296218l) : j.d(this, channel, (ReadableByteChannel) s(), this, this.f296216j, this.f296218l);
    }

    @Override // io.ktor.network.sockets.m0
    @NotNull
    public final io.ktor.utils.io.y0 r(@NotNull io.ktor.utils.io.b channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        return l.a(this, channel, (WritableByteChannel) s(), this, this.f296216j, this.f296218l);
    }

    @Override // io.ktor.network.selector.h
    @NotNull
    public S s() {
        return this.f296215i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull S channel, @NotNull io.ktor.network.selector.j selector, @Nullable io.ktor.utils.io.pool.h<ByteBuffer> hVar, @Nullable p0.e eVar) {
        super(kotlin.coroutines.h.f312451a);
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f296215i = channel;
        this.f296216j = selector;
        this.f296217k = hVar;
        this.f296218l = eVar;
    }
}
