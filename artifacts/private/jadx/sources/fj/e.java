package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
@hj.c(applicableTo = String.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {

    public static class a implements hj.f<e> {
        @Override // hj.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public hj.g a(e eVar, Object obj) {
            return Pattern.compile(eVar.value(), eVar.flags()).matcher((String) obj).matches() ? hj.g.ALWAYS : hj.g.NEVER;
        }
    }

    int flags() default 0;

    @m
    String value();
}
