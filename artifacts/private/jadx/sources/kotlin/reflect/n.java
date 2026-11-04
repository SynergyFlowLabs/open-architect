package kotlin.reflect;

import kotlin.e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface n extends kotlin.reflect.b {

    public static final class a {
        @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
        public static /* synthetic */ void a() {
        }
    }

    public enum b {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f312985e = kotlin.enums.c.c(k());

        static {
            int i10 = 2 >> 1;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f312985e;
        }
    }

    @NotNull
    s c();

    int getIndex();

    @NotNull
    b getKind();

    @Nullable
    String getName();

    boolean s();

    boolean x();
}
