package mx.com.citi.demo.util;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

public class HibernateAwareObjectMapper extends ObjectMapper {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HibernateAwareObjectMapper() {
        registerModule(new Hibernate4Module());
        setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
}