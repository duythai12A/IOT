//package com.example.webbanquanao.controller;
//
//import com.example.webbanquanao.service.ProductService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api/product")
//public class ProductController {
//    private ProductService productService;
//    private ProductRepository productRepository;
//    private ObjectMapper objectMapper;
//
//    public ProductService getProductService() {
//        return productService;
//    }
//
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }
//
//    public ProductRepository getProductRepository() {
//        return productRepository;
//    }
//
//    public void setProductRepository(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    public ObjectMapper getObjectMapper() {
//        return objectMapper;
//    }
//
//    public void setObjectMapper(ObjectMapper objectMapper) {
//        this.objectMapper = objectMapper;
//    }
//
////    @GetMapping("/{id}")
////    public ResponseEntity<ResponseBase> getById(@PathVariable("id") Long id){
////        ResponseBase responseBase;
////        HttpStatus httpStatus;
////
////        Optional<Product> product = productRepository.findById(id);
////        if(!product.isPresent()){
////            responseBase = new ResponseBase(new Object[]{ResponseType.FAIL,}, ResponseType.FAIL,"404", Constants.NOT_FOUND_PRODUCT);
////            return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
////        }
////        ProductDTO productDTO = objectMapper.convertValue(product.get(), ProductDTO.class);
////        httpStatus = HttpStatus.OK;
////        responseBase = new ResponseBase(new Object[]{productDTO}, ResponseType.SUCCESS, "");
////        return new ResponseEntity<>(responseBase, httpStatus);
////    }
////
////    @GetMapping("search")
////    public ResponseEntity<ResponseBase> search(Pageable pageable){
////        ResponseBase responseBase;
////        HttpStatus httpStatus;
////        httpStatus = HttpStatus.OK;
////        responseBase = new ResponseBase(new Object[]{productService.search(pageable)}, ResponseType.SUCCESS, "");
////        return new ResponseEntity<>(responseBase, httpStatus);
////    }
////
////    @PostMapping()
////    public ResponseEntity<ResponseBase> create(@RequestBody ProductDTO productDTO){
////        ResponseBase responseBase;
////        HttpStatus httpStatus;
////        Optional<Cart> cart = cartRepository.findById(productDTO.getCartId());
////        if(!cart.isPresent()){
////            responseBase = new ResponseBase(new Object[]{ResponseType.FAIL,}, ResponseType.FAIL,"404", Constants.NOT_FOUND_Cart);
////            return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
////        }
////        httpStatus = HttpStatus.OK;
////        responseBase = new ResponseBase(new Object[]{productService.create(productDTO)}, ResponseType.SUCCESS, "");
////        return new ResponseEntity<>(responseBase, httpStatus);
////    }
////
////    @PutMapping()
////    public ResponseEntity<ResponseBase> update(@RequestBody ProductDTO productDTO){
////        ResponseBase responseBase;
////        HttpStatus httpStatus;
////
////        Optional<Product> product = productRepository.findById(productDTO.getId());
////        if(!product.isPresent()){
////            responseBase = new ResponseBase(new Object[]{ResponseType.FAIL,}, ResponseType.FAIL,"404", Constants.NOT_FOUND_PRODUCT);
////            return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
////        }
////
////        Optional<Cart> cart = cartRepository.findById(productDTO.getCartId());
////        if(!cart.isPresent()){
////            responseBase = new ResponseBase(new Object[]{ResponseType.FAIL,}, ResponseType.FAIL,"404", Constants.NOT_FOUND_Cart);
////            return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
////        }
////        httpStatus = HttpStatus.OK;
////        responseBase = new ResponseBase(new Object[]{productService.update(productDTO)}, ResponseType.SUCCESS, "");
////        return new ResponseEntity<>(responseBase, httpStatus);
////    }
////
////    @DeleteMapping("/{id}")
////    public ResponseEntity<ResponseBase> delete(@PathVariable("id") Long id){
////        ResponseBase responseBase;
////        HttpStatus httpStatus;
////
////        Optional<Product> product = productRepository.findById(id);
////        if(!product.isPresent()){
////            responseBase = new ResponseBase(new Object[]{ResponseType.FAIL,}, ResponseType.FAIL,"404", Constants.NOT_FOUND_PRODUCT);
////            return new ResponseEntity<>(responseBase, HttpStatus.BAD_REQUEST);
////        }
////        productService.delete(id);
////        httpStatus = HttpStatus.OK;
////        responseBase = new ResponseBase(new Object[]{null}, ResponseType.SUCCESS, "");
////        return new ResponseEntity<>(responseBase, httpStatus);
////    }
//}
