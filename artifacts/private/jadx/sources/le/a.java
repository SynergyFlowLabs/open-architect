package le;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    /* JADX INFO: renamed from: le.a$a, reason: collision with other inner class name */
    public enum EnumC2326a {
        plan_recognition("plan_recognition"),
        plan_wizard("plan_wizard"),
        furnisher("ai_designer:furnisher"),
        styler("ai_designer:styler"),
        rearranger("ai_designer:rearranger"),
        decorator("ai_designer:decorator");


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f322668i = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f322669a;

        EnumC2326a(String str) {
            this.f322669a = str;
        }

        @NotNull
        public static kotlin.enums.a<EnumC2326a> l() {
            return f322668i;
        }

        @NotNull
        public final String n() {
            return this.f322669a;
        }
    }

    @Nullable
    Object a(int i10, @NotNull String str, long j10, @Nullable String str2, @Nullable id.a aVar, @Nullable EnumC2326a enumC2326a, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object b(long j10, @NotNull kotlin.coroutines.d<? super Boolean> dVar);
}
