package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.CLASS})
@h
@kotlinx.serialization.g
public @interface JsonClassDiscriminator {

    public /* synthetic */ class Impl implements JsonClassDiscriminator {
        private final /* synthetic */ String discriminator;

        public Impl(@NotNull String discriminator) {
            Intrinsics.checkNotNullParameter(discriminator, "discriminator");
            this.discriminator = discriminator;
        }

        @Override // kotlinx.serialization.json.JsonClassDiscriminator
        public final /* synthetic */ String discriminator() {
            return this.discriminator;
        }
    }

    String discriminator();
}
