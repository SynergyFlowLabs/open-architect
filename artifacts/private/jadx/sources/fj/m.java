package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes11.dex */
@o("RegEx")
@hj.e
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface m {

    public static class a implements hj.f<m> {
        @Override // hj.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public hj.g a(m mVar, Object obj) {
            if (!(obj instanceof String)) {
                return hj.g.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return hj.g.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return hj.g.NEVER;
            }
        }
    }

    hj.g when() default hj.g.ALWAYS;
}
