package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@hj.c(applicableTo = Number.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface f {

    public static class a implements hj.f<f> {
        @Override // hj.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public hj.g a(f fVar, Object obj) {
            if (!(obj instanceof Number)) {
                return hj.g.NEVER;
            }
            Number number = (Number) obj;
            return (!(number instanceof Long) ? !(!(number instanceof Double) ? !(!(number instanceof Float) ? number.intValue() < 0 : number.floatValue() < 0.0f) : number.doubleValue() < 0.0d) : number.longValue() < 0) ? hj.g.ALWAYS : hj.g.NEVER;
        }
    }

    hj.g when() default hj.g.ALWAYS;
}
