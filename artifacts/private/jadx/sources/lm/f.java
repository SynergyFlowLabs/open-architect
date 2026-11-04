package lm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
public final class f {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        @k
        @org.intellij.lang.annotations.d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        String childrenArray() default "";

        @k
        @org.intellij.lang.annotations.d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        String hasChildren() default "";

        @k
        @org.intellij.lang.annotations.d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        String text() default "";
    }

    private f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
