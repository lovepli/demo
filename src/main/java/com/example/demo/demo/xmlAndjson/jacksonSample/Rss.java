package com.example.demo.demo.xmlAndjson.jacksonSample;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Rss代表XML的跟元素
 */
@JacksonXmlRootElement(localName = "rss")
public class Rss {

	public Channel channel;

}
