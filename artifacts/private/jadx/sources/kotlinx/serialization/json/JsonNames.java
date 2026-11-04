package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Target({})
@z
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.PROPERTY})
@kotlinx.serialization.g
public @interface JsonNames {

    public /* synthetic */ class Impl implements JsonNames {
        private final /* synthetic */ String[] names;

        public Impl(@NotNull String[] names) {
            Intrinsics.checkNotNullParameter(names, "names");
            this.names = names;
        }

        @Override // kotlinx.serialization.json.JsonNames
        public final /* synthetic */ String[] names() {
            return this.names;
        }
    }

    String[] names();
}
