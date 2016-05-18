import java.io.IOException;
import java.util.logging.Filter;

public class UsuarioFilter implements Filter {

	public static ThreadLocal<String> usuario = new ThreadLocal<>();

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

          HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);
        if (session != null) {
            usuario.set(session.getAttribute(“usuario”);
        }
          chain.doFilter(request, wrapper);
       }
}