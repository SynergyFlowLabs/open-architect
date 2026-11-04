package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@hj.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g {

    public static class a implements hj.f<g> {
        @Override // hj.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public hj.g a(g gVar, Object obj) {
            return obj == null ? hj.g.NEVER : hj.g.ALWAYS;
        }
    }

    hj.g when() default hj.g.ALWAYS;
}
