package lm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
public final class b {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: renamed from: lm.b$b, reason: collision with other inner class name */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC2330b {
    }

    private b() {
        throw new AssertionError("Async should not be instantiated");
    }
}
