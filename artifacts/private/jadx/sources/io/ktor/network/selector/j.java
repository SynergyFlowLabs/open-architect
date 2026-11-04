package io.ktor.network.selector;

import java.io.Closeable;
import java.nio.channels.spi.SelectorProvider;
import kotlin.Unit;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface j extends s0, Closeable {

    @NotNull
    public static final a I2 = a.f296201a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f296201a = new a();

        private a() {
        }
    }

    void g3(@NotNull h hVar);

    @Nullable
    Object i3(@NotNull h hVar, @NotNull g gVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    SelectorProvider u0();
}
