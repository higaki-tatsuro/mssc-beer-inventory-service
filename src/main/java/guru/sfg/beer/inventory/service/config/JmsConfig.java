package guru.sfg.beer.inventory.service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {

    public static final String NEW_INVENTORY_QUEUE = "new-inventory";

    public static final String ALLOCATE_ORDER_QUEUE = "allocate-order";

    public static final String ALLOCATE_ORDER_RESPONSE_QUEUE = "allocate-order-response";

    @Bean
    public MessageConverter jacksonJmsMessageConverter(ObjectMapper objectMapper){
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setTargetType(MessageType.TEXT);
        messageConverter.setTypeIdPropertyName("_type");

        messageConverter.setObjectMapper(objectMapper);

        return messageConverter;
    }
}
