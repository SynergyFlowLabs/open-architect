package app.rive.runtime.kotlin.core;

import androidx.annotation.i;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface RefCount {

    public static final class DefaultImpls {
        @i
        public static int acquire(@NotNull RefCount refCount) {
            return refCount.getRefs().incrementAndGet();
        }

        public static int getRefCount(@NotNull RefCount refCount) {
            return refCount.getRefs().get();
        }

        @i
        public static int release(@NotNull RefCount refCount) {
            return refCount.getRefs().decrementAndGet();
        }
    }

    @i
    int acquire();

    int getRefCount();

    @NotNull
    AtomicInteger getRefs();

    @i
    int release();

    void setRefs(@NotNull AtomicInteger atomicInteger);
}
