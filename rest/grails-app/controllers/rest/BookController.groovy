package rest

import grails.rest.RestfulController

class BookController extends RestfulController {
    static responseFormats = ['json', 'xml']

    BookController() {
        super(Book)
    }
}