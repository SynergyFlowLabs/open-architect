package com.superwall.supercel;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface Disposable {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final void destroy(@NotNull Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Object obj : args) {
                if (obj instanceof Disposable) {
                    ((Disposable) obj).destroy();
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj2 = arrayList.get(i10);
                        if (obj2 instanceof Disposable) {
                            ((Disposable) obj2).destroy();
                        }
                    }
                } else if (obj instanceof Map) {
                    for (Object obj3 : ((Map) obj).values()) {
                        if (obj3 instanceof Disposable) {
                            ((Disposable) obj3).destroy();
                        }
                    }
                } else if (obj instanceof Iterable) {
                    for (Object obj4 : (Iterable) obj) {
                        if (obj4 instanceof Disposable) {
                            ((Disposable) obj4).destroy();
                        }
                    }
                }
            }
        }
    }

    void destroy();
}
